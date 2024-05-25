Филип Ѓошевски 203220

2.Control Flow Graph:

![ControlFlowGraph](https://github.com/gjosevskifilip/SI_2024_lab2_203220/assets/159798506/7f1757e4-937b-4d7d-bfd5-55ddb3c02124)

3. V(G) = E−N+2P
   V(G) = 32 - 25 + 2 *1 = 9

5.Тест случаи според Multiple Condition критериумот за условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')
True, True, True

Влез: new Item("item1", "0123", 350, 0.1f)
Излез: Сумата се намалува за 30

True, True, False
Влез: new Item("item1", "1123", 350, 0.1f)
Излез: Сумата не се намалува

True, False, True
Влез: new Item("item1", "0123", 350, 0)
Излез: Сумата не се намалува

True, False, False
Влез: new Item("item1", "1123", 350, 0)
Излез: Сумата не се намалува

False, True, True
Влез: new Item("item1", "0123", 200, 0.1f)
Излез: Сумата не се намалува

False, True, False
Влез: new Item("item1", "1123", 200, 0.1f)
Излез: Сумата не се намалува

False, False, True
Влез: new Item("item1", "0123", 200, 0)
Излез: Сумата не се намалува

False, False, False
Влез: new Item("item1", "1123", 200, 0)
Излез: Сумата не се намалува
