package __foursquare_shaded__.com.fasterxml.jackson.module.scala

import __foursquare_shaded__.com.fasterxml.jackson.module.scala.deser.{SortedSetDeserializerModule, UnsortedSetDeserializerModule}

trait SetModule extends UnsortedSetDeserializerModule with SortedSetDeserializerModule
