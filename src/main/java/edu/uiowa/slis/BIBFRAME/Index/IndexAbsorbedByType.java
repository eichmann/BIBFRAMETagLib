package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexAbsorbedByIterator theIndexAbsorbedByIterator = (IndexAbsorbedByIterator)findAncestorWithClass(this, IndexAbsorbedByIterator.class);
			pageContext.getOut().print(theIndexAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

