import minecraft
import exploit

player = minecraft.user

minecraft.exploit()
  player.allow {
  through.blocks
}
  
process.stop {
  when.!block
}
