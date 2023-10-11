//https://codeforces.com/problemset/problem/1886/B
#include <bits/stdc++.h>
using namespace std;

double distance(double x1, double y1, double x2, double y2)
{
    return sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
}

int main()
{
    int test;
    double px, py, ax, ay, bx, by, t;
    cin >> test;

    while (test-- > 0)
    {
        cin >> px >> py;
        cin >> ax >> ay;
        cin >> bx >> by;

        double minN = 0, maxN;
        maxN = max(max(max(distance(0, 0, ax, ay), distance(0, 0, bx, by)), max(distance(px, py, ax, ay), distance(px, py, bx, by))), distance(px, py, 0, 0));
        cout << maxN << " max value " << minN << endl;
        while (abs(maxN - minN) > 1e-8)
        {
            double oa, ob, ap, bp, ab;
            t = (maxN + minN) / 2;
            oa = distance(0, 0, ax, ay);
            ob = distance(0, 0, bx, by);
            ap = distance(px, py, ax, ay);
            bp = distance(bx, by, px, py);
            ab = distance(bx, by, ax, ay);
            if ((oa >= t && bp >= t && ab >= t) || (oa >= t && bp >= t && ab >= t))
            {
                maxN = t;
            }
            else
            {
                minN = t;
            }
            cout << maxN << " max value " << minN << endl;
        }
        cout << t << endl;
    }
}
