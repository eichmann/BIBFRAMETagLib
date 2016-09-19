package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasTitleIterator theIndexHasTitleIterator = (IndexHasTitleIterator)findAncestorWithClass(this, IndexHasTitleIterator.class);
			pageContext.getOut().print(theIndexHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

