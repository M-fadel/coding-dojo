    class Node {
        constructor(data) {
            this.data = data;
            this.next = null;
        }
    }

    class SinglyLinkedList {
        constructor() {
            this.head = null;
        }
        insertAtBack(data) {
            if (this.head == null) {
                this.head = new Node(data);
            } else {
                let runner = this.head;
                while (runner.next !== null) {
                    runner = runner.next;
                }
                runner.next = new Node(data);
            }
            return this;
        }
        insertAtFront(data) {
            if (this.head !== null) {
                var temp = this.head;
                this.head = new Node(data)
                this.head.next = temp
            } else {
                this.head = new Node(data)
            }

        }
        print() {
            let runner = this.head;

            while (runner.next !== null) {
                console.log(runner.data)
                runner = runner.next;
            }
            console.log(runner.data)
        }
        contain(number) {

            let runner = this.head;

            while (runner.next != null) {
                if (runner.data == number) {
                    return true
                }
                runner = runner.next;
            }
            if (runner.data == number) {
                return true
            }
            return false
        }
        removeBack() {
            let runner = this.head;
            while (runner.next.next != null) {

                runner = runner.next;
            }
            runner.next = null;
        }
        avrg() {
            let total = 0
            var count = 0
            let runner = this.head
            while (runner.next !== null) {
                total += runner.data
                count++;
                runner = runner.next;
            }
            total += runner.data
            count++;
            return (total / count)
        }
        remoovehead() {
            if (this.head != null) {
                if (this.head.next == null) {
                    this.head = null
                } else {
                    this.head = this.head.next
                }
            }
        }
    }
    var newList = new SinglyLinkedList();
    newList.insertAtBack(5).insertAtBack(8).insertAtBack(2);
    newList.print();
    newList.remoovehead();
    newList.insertAtFront(4)
    console.log("avrg:", newList.avrg())
    console.log('--------')

    newList.removeBack();
    console.log(newList.contain(5))
    newList.print();


