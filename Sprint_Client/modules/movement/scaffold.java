import minecraft
import exploit

player = minecraft.user

minecraft.exploit()
when.player {
  is.floating
}

build.beneath.player

process.stop {
  when.player.!floating
}
