import minecraft
import hack

player = minecraft.user

minecraft.hack()
  player.allow {
  walk.water
}

process.stop {
  when.!water
}