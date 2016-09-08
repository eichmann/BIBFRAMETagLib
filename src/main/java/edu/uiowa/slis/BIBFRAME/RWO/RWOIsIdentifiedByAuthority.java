package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOIsIdentifiedByAuthority extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOIsIdentifiedByAuthority currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOIsIdentifiedByAuthority.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOIsIdentifiedByAuthorityIterator theRWOIsIdentifiedByAuthorityIterator = (RWOIsIdentifiedByAuthorityIterator)findAncestorWithClass(this, RWOIsIdentifiedByAuthorityIterator.class);
			pageContext.getOut().print(theRWOIsIdentifiedByAuthorityIterator.getIsIdentifiedByAuthority());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for isIdentifiedByAuthority tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for isIdentifiedByAuthority tag ");
		}
		return SKIP_BODY;
	}
}

