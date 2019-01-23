﻿### Parking lot suggestion system

Build a simple console based parking system for multi-floor parking lot which suggests the nearest floor where to drive by floor occupancy level and vehicle type restrictions.

Workflow:
Vehicle approaching boom barrier, plate is scanned, vehicle details could be resolved from internal register by plate number, algorithm calculates available parking floor by vehicle type. Output is the suggested floor number.

Requirements:
1) Parking lot can have underground floors (i.e. from -2 to 8)
2) Boom barrier(s), by which vehicle can enter parking lot, could be located at any floor (e.g. -1, -2, +1, +2).
3) There can be three vehicle types - petrol/diesel, electric and vans.
4) Vehicle with petrol/diesel engines can park on any floor that has a free parking space, electric cars can only park only top two floors and vans must park at bottom two floors.
5) Create a simple dummy data for testing your algorithm.

Technical details:
1) Program must be written in Scala or Java. Big bonus for Scala.
2) If some requirements seem missing or are unclear - use your best judgement.
3) Applying functional programming principles would be a bonus.
4) Bonus points for unit tests

