package m240

import "testing"

func Test_searchMatrix(t *testing.T) {
	type args struct {
		matrix [][]int
		target int
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{"Test case 1: true",
			args{[][]int{{1, 4, 7, 11, 15},
				{2, 5, 8, 12, 19},
				{3, 6, 9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}}, 5}, true},
		{"Test case 2: false",
			args{[][]int{{1, 4, 7, 11, 15},
				{2, 5, 8, 12, 19},
				{3, 6, 9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}}, 20}, false},
		{"Test case 3: true",
			args{[][]int{{7}}, 7}, true},
		{"Test case 4: true",
			args{[][]int{{1, 2, 4, 7}}, 4}, true},
		{"Test case 5: false",
			args{[][]int{{1, 4}, {2, 5}}, 6}, false},
		{"Test case 6: true",
			args{[][]int{{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}}, 15}, true},
		{"Test case 7: false",
			args{[][]int{{1, 4, 7, 11, 15},
				{2, 5, 8, 12, 19},
				{3, 6, 9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}}, 0}, false},
		{"Test case 8: false",
			args{[][]int{{5, 6, 9, 14, 17, 17, 19},
				{8, 10, 14, 15, 21, 24, 28},
				{8, 10, 16, 21, 21, 26, 33},
				{13, 17, 17, 23, 26, 27, 33},
				{16, 22, 23, 27, 31, 31, 34},
				{16, 26, 28, 30, 32, 32, 37},
				{19, 31, 35, 35, 39, 44, 44},
				{20, 31, 39, 44, 48, 51, 52},
				{23, 36, 40, 47, 51, 51, 53}}, 45}, false},
		{"Test case 9: true",
			args{[][]int{{3, 3, 8, 13, 13, 18},
				{4, 5, 11, 13, 18, 20},
				{9, 9, 14, 15, 23, 23},
				{13, 18, 22, 22, 25, 27},
				{18, 22, 23, 28, 30, 33},
				{21, 25, 28, 30, 35, 35},
				{24, 25, 33, 36, 37, 40}}, 21}, true},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := searchMatrix(tt.args.matrix, tt.args.target); got != tt.want {
				t.Errorf("searchMatrix() = %v, want %v", got, tt.want)
			}
		})
	}
}
