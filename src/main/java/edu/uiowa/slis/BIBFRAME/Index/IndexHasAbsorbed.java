package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasAbsorbedIterator theIndexHasAbsorbedIterator = (IndexHasAbsorbedIterator)findAncestorWithClass(this, IndexHasAbsorbedIterator.class);
			pageContext.getOut().print(theIndexHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

