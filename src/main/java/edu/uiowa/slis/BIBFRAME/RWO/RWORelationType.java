package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWORelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWORelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(RWORelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWORelationIterator theRWORelationIterator = (RWORelationIterator)findAncestorWithClass(this, RWORelationIterator.class);
			pageContext.getOut().print(theRWORelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for relation tag ");
		}
		return SKIP_BODY;
	}
}

