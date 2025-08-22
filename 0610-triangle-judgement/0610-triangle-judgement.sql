SELECT x, y , z,
if(x+y > z AND y+z > x AND x + z > y , "Yes" , "No") AS Triangle
FROM Triangle;