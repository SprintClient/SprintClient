import minecraft
import exploit

player = minecraft.user

minecraft.exploit()
  player.allow {
  walk.water
}

process.stop {
  when.!water
}
