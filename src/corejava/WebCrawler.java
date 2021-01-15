//package corejava;
//
//import java.util.List;
//import java.util.*;
//import java.util.concurrent.*;
//
//public class WebCrawler implements HtmlParser{
//
//    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
//
//        Set<String> visited = ConcurrentHashMap.newKeySet();
//        ExecutorService pool = Executors.newCachedThreadPool(); // Thread Pool (Executor)
//        Deque<Future<List<String>>> tasks = new ArrayDeque<>();
//        visited.add(startUrl);
//
//        Future<List<String>> future = pool.submit(getCallableTask(startUrl, visited, htmlParser));
//        tasks.addLast(future);
//        try {
//            while (!tasks.isEmpty()) {
//                List<String> newlyGottenUrls = tasks.removeFirst().get(); // get() throws InterruptedException
//                for (String newlyGottenUrl : newlyGottenUrls) {
//                    if (!visited.contains(newlyGottenUrl)) {
//                        visited.add(newlyGottenUrl);
//                        future = pool.submit(getCallableTask(newlyGottenUrl, visited, htmlParser));
//                        tasks.add(future);
//                    }
//                }
//            }
//        } catch (InterruptedException | ExecutionException e) {
//            System.out.println(e.getMessage());
//        }
//
//        pool.shutdown(); // do not forget to shutdown the executor
//
//        return new LinkedList<String>(visited);
//    }
//
//    private Callable<List<String>> getCallableTask(String url, Set<String> visited, HtmlParser htmlParser) {
//        return  new Callable<List<String>>() {
//            public List<String> call() {
//                List<String> list = new ArrayList<>();
//                for (String newUrl : htmlParser.getUrls(url)) {
//                    if (!visited.contains(newUrl)) {
//                        System.out.print(newUrl + "  ");
//                        list.add(newUrl);
//                    }
//                }
//                return list;
//            }
//        };
//
//    }
//
//    public static void main(String[] args) {
//        crawl();
//    }
//
//    @Override
//    public List<String> getUrls(String url) {
//        return null;
//    }
//}
