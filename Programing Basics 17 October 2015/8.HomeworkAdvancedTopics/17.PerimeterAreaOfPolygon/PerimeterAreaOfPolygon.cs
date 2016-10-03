using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PerimeterAreaOfPolygon
{
    class Point
    {
        public int X { get; set; }
        public int Y { get; set; }
    }

    class PerimeterAreaOfPolygon
    {
        static void Main()
        {
            int iteracion = int.Parse(Console.ReadLine());
            List<Point> pointList = new List<Point>();

            //Making a list of points
            for (int i = 0; i < iteracion; i++)
            {
                //Taking X and Y
                string[] strArr = Console.ReadLine().Split(' ');
                int x = int.Parse(strArr[0]);
                int y = int.Parse(strArr[1]);

                //Making Point
                Point point = new Point() { X = x, Y = y };
                //point.X = x;
                //point.Y = y;

                //Puting the point in to a list of points
                pointList.Add(point);
            }

            //Chek the last point is equal to the first
            bool areTheSame = pointList[0].X == pointList[pointList.Count - 1].X && pointList[0].Y == pointList[pointList.Count - 1].Y;

            if (!areTheSame)
            {
                pointList.Add(pointList[0]);
            }

            double perimeter = CalcLineLength(pointList);
            Console.WriteLine("perimeter = {0:f2}", perimeter);

            double area = PolygonArea(pointList);
            Console.WriteLine("area = {0:0.##}", area);

        }

        static double PolygonArea(List<Point> polygon)
        {
            double area = 0;

            for (int i = 0; i < polygon.Count; i++)
            {
                //Pri posledna iteraciq umnojavam po 0, ne izlizam ot duljinata na lista
                int nextPoin = (i + 1) % polygon.Count;

                area += polygon[i].X * polygon[nextPoin].Y;
                area -= polygon[i].Y * polygon[nextPoin].X;
            }

            area /= 2;
            //ako dannite sa obratno na chas strelka e minus
            return (area < 0 ? -area : area);
        }

        //PolygonPerimeter
        static double CalcLineLength(List<Point> line)
        {
            double length = 0;
            for (int i = 0; i < line.Count - 1; i++)
            {
                length += CalcDictance(line[i].X, line[i].Y, line[i + 1].X, line[i + 1].Y);
            }
            return length;
        }

        //Distance bitwen two points
        static double CalcDictance(int x1, int y1, int x2, int y2)
        {
            int dx = x2 - x1;
            int dy = y2 - y1;
            double distance = Math.Sqrt(dx * dx + dy * dy);
            return distance;
        }
    }
}
