package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIsUnionOfIterator theIndexIsUnionOfIterator = (IndexIsUnionOfIterator)findAncestorWithClass(this, IndexIsUnionOfIterator.class);
			pageContext.getOut().print(theIndexIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

