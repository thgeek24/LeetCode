package m649

import "testing"

func Test_predictPartyVictory(t *testing.T) {
	type args struct {
		senate string
	}
	tests := []struct {
		name string
		args args
		want string
	}{
		{"Test case 1: Radiant wins", args{"RD"}, "Radiant"},
		{"Test case 2: Dire wins", args{"RDD"}, "Dire"},
		{"Test case 3: Radiant wins", args{"DDRRRR"}, "Radiant"},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := predictPartyVictory(tt.args.senate); got != tt.want {
				t.Errorf("predictPartyVictory() = %v, want %v", got, tt.want)
			}
		})
	}
}
