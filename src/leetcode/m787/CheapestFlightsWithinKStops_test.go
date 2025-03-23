package m787

import "testing"

func Test_findCheapestPrice(t *testing.T) {
	type args struct {
		n       int
		flights [][]int
		src     int
		dst     int
		k       int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{"Test case 1", args{4,
			[][]int{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}},
			0, 3, 1}, 700},
		{"Test case 2", args{3,
			[][]int{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}},
			0, 2, 1}, 200},
		{"Test case 3", args{3,
			[][]int{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}},
			0, 2, 0}, 500},
		{"Test case 4", args{5,
			[][]int{{0, 1, 5}, {1, 2, 5}, {0, 3, 2}, {3, 1, 2}, {1, 4, 1}, {4, 2, 1}},
			0, 2, 2}, 7},
		{"Test case 5", args{4,
			[][]int{{0, 1, 1}, {0, 2, 5}, {1, 2, 1}, {2, 3, 1}},
			0, 3, 1}, 6},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := findCheapestPrice(tt.args.n, tt.args.flights, tt.args.src, tt.args.dst, tt.args.k); got != tt.want {
				t.Errorf("findCheapestPrice() = %v, want %v", got, tt.want)
			}
		})
	}
}
