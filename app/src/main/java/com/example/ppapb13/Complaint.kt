package com.example.ppapb13

import java.io.Serializable

data class Complaint(
    var id: String = "",
    var nameComplaint: String = "",
    var titleComplaint: String = "",
    var descComplaint: String = ""
) : Serializable

