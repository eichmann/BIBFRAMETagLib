package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWORelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWORelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RWORelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWORelationInverseIterator theRWORelationInverseIterator = (RWORelationInverseIterator)findAncestorWithClass(this, RWORelationInverseIterator.class);
			pageContext.getOut().print(theRWORelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for relation tag ");
		}
		return SKIP_BODY;
	}
}

