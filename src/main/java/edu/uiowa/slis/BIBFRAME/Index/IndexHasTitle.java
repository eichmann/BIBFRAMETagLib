package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasTitleIterator theIndexHasTitleIterator = (IndexHasTitleIterator)findAncestorWithClass(this, IndexHasTitleIterator.class);
			pageContext.getOut().print(theIndexHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

