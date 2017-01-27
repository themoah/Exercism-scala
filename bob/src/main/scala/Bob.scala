class Bob {
  def hey(statement: String): String = statement match {
    case m if m.trim == "" => "Fine. Be that way!"
    case m if m.endsWith("?") => "Sure"
    case m if m.toUpperCase == m => "Whoa, chill out!"
    case _ => "Whatever."
  }
}