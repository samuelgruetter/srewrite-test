package com.tree.printer

trait Optimistic {
  self: KeyedEntity[_] =>
  protected val occVersionNumber = 0
}

trait KeyedEntity[K]
