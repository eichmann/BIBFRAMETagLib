package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexDerivedFromIterator theIndexDerivedFromIterator = (IndexDerivedFromIterator)findAncestorWithClass(this, IndexDerivedFromIterator.class);
			pageContext.getOut().print(theIndexDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

