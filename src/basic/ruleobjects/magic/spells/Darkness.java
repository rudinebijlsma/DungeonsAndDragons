package basic.ruleobjects.magic.spells;

import basic.ruleobjects.magic.CastingTime;
import basic.ruleobjects.magic.Spell;

public class Darkness extends Spell {

	public Darkness() {
		setCastingTime(CastingTime.ACTION);
		setName("Darkness");
		setDescription(createDescription());
		setRange("60 ft. 12v.");
		setLevel(2);
		setDurationRounds(100);
		setSpellComponents(SpellComponentService.getVerbalMaterial());
		setConcentration(true);
	}
	
	@Override
	protected String createDescription() {
		return "Magical darkness spreads from a point you choose within range to fill"
				+ " a 15-foot-radius sphere for the duration. The darkness spreads around"
				+ " corners. A creature with darkvision can�t see through this darkness,"
				+ " and nonmagical light can�t illuminate it. If the point you choose is"
				+ " on an object you are holding or one that isn�t being worn or carried,"
				+ " the darkness emanates from the object and moves with it. Completely"
				+ " covering the source of the darkness with an opaque object, such as a"
				+ " bowl or a helm, blocks the darkness. If any of this spell�s area overlaps"
				+ " with an area of light created by a spell of 2nd level or lower, the spell"
				+ " that created the light is dispelled.";
	}
}
