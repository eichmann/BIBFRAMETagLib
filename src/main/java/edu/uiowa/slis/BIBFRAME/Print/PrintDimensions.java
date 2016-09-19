package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintDimensions extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintDimensions currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintDimensions.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintDimensionsIterator thePrint = (PrintDimensionsIterator)findAncestorWithClass(this, PrintDimensionsIterator.class);
			pageContext.getOut().print(thePrint.getDimensions());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for dimensions tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for dimensions tag ");
		}
		return SKIP_BODY;
	}
}

