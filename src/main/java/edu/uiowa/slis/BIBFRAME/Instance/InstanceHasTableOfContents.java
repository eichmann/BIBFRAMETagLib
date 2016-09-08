package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasTableOfContents extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasTableOfContents currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasTableOfContents.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasTableOfContentsIterator theInstanceHasTableOfContentsIterator = (InstanceHasTableOfContentsIterator)findAncestorWithClass(this, InstanceHasTableOfContentsIterator.class);
			pageContext.getOut().print(theInstanceHasTableOfContentsIterator.getHasTableOfContents());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasTableOfContents tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasTableOfContents tag ");
		}
		return SKIP_BODY;
	}
}

