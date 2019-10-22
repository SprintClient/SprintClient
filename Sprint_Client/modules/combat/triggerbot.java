import minecraft
import exploit

player = minecraft.user

when.enemy {
  is.within 
    hitrange.attack
}

process.stop {
  when.!enemy
}
