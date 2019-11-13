import minecraft
import exploit

player = minecraft.user

minecraft.exploit()
when.enemy {
  is.within 
    hitrange.attack
}

process.stop {
  when.!enemy
}
