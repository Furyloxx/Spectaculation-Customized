package me.superischroma.spectaculation.item.oddities;

import me.superischroma.spectaculation.item.MaterialFunction;
import me.superischroma.spectaculation.item.Rarity;
import me.superischroma.spectaculation.item.GenericItemType;
import me.superischroma.spectaculation.item.SkullStatistics;

public class AgentOfDestruction implements SkullStatistics, MaterialFunction 
{
@Override 
public String getDisplayName() 
{
return "Agent Of Destruction";
} 
 
@Override
public Rarity getRarity()  
{ 
return Rarity.VERY_SPECIAL; 
} 
 
@Override  
public String getLore() 
{
return "The &cGreat Bulla Cyclone The rain that stung like a thousand needles, "+ 
"The water that struck like a tsunami, "+ 
"Thousands of homes where swept away with the water, "+
"Millions of people died near the coast, "+
" The Most Dangerous Cyclone know as the &cGreat Bulla Cyclone.";
}
 
@Override 
public GenericItemType getType() 
{  
return GenericItemType.ITEM;
}
 
@Override
public boolean isStackable() 
{
 return false;  
}  
 
@Override 
public String getURL() 
{ 
return "b543bbd96571b1e35aa039a5ebad65f41427c8b8871ddf767580f3a5b1622fbf"; 
}
 
}
