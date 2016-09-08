package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasAbsorbedIterator theIndexHasAbsorbedIterator = (IndexHasAbsorbedIterator)findAncestorWithClass(this, IndexHasAbsorbedIterator.class);
			pageContext.getOut().print(theIndexHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

