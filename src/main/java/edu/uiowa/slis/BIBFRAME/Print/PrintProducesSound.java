package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintProducesSound extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintProducesSound currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintProducesSound.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintProducesSoundIterator thePrint = (PrintProducesSoundIterator)findAncestorWithClass(this, PrintProducesSoundIterator.class);
			pageContext.getOut().print(thePrint.getProducesSound());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for producesSound tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for producesSound tag ");
		}
		return SKIP_BODY;
	}
}

