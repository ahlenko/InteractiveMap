package com.example.interactivemap.logic.util

object IntentPlainTextUtil {
    fun processingReceiveMessage(message: String): Pair<Boolean, List<String>> {
        val baseUrlRegex = Regex("""https?://[^/]+""")
        val baseUrlMatch = baseUrlRegex.find(message)
        val baseUrl = baseUrlMatch?.value ?: return Pair(false, emptyList())

        val regex = Regex("""(?<=/stud/)[^/]+""")
        val matches = regex.findAll(message)
        val links = mutableListOf<String>()
        for (match in matches) {
            var link = "$baseUrl/stud/${match.value}"
            link = link.replace("\n", "")
            links.add(link.trim())
        }
        return Pair(links.isNotEmpty(), links)
    }
}