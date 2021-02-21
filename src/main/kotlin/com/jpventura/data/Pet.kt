package com.jpventura.data

data class Pet(val id: Long, val photoUrls: Map<String, String>, val tags: Map<String, Tag>)
