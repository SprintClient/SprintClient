import minecraft
import exploit

player = minecraft.user

minecraft.exploit()
  player.allow {
  fly
}

process.stop {
  when.player.!flying
}
