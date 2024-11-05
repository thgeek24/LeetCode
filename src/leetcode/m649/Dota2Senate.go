package m649

func predictPartyVictory(senate string) string {
	var rQueue []int
	var dQueue []int
	for i, senator := range senate {
		if senator == 'R' {
			rQueue = append(rQueue, i)
		} else {
			dQueue = append(dQueue, i)
		}
	}

	senateSize := len(senate)
	for len(dQueue) > 0 && len(rQueue) > 0 {
		rIndex := rQueue[0]
		dIndex := dQueue[0]
		rQueue = rQueue[1:]
		dQueue = dQueue[1:]

		if rIndex < dIndex {
			rQueue = append(rQueue, rIndex+senateSize)
		} else {
			dQueue = append(dQueue, dIndex+senateSize)
		}
	}

	if len(rQueue) > 0 {
		return "Radiant"
	}
	return "Dire"
}
