public static int doy(int m, int dom, int y) {
    if (m == 2) {
        dom += 31;
    } else if (m == 3) {
        dom += 59;
    } else if (m == 4) {
        dom += 90;
    } else if (m == 5) {
        dom += 31 + 28 + 31 + 30;
    } else if (m == 6) {
        dom += 31 + 28 + 31 + 30 + 31;
    } else if (m == 7) {
        dom += 31 + 28 + 31 + 30 + 31 + 30;
    } else if (m == 8) {
        dom += 31 + 28 + 31 + 30 + 31 + 30 + 31;
    } else if (m == 9) {
        dom += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
    } else if (m == 10) {
        dom += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
    } else if (m == 11) {
        dom += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
    } else if (m == 12) {
        dom += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
    }
    return dom;
 }
