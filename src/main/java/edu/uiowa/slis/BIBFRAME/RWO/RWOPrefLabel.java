package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOPrefLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOPrefLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOPrefLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RWOPrefLabelIterator theRWO = (RWOPrefLabelIterator)findAncestorWithClass(this, RWOPrefLabelIterator.class);
			pageContext.getOut().print(theRWO.getPrefLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for prefLabel tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for prefLabel tag ");
		}
		return SKIP_BODY;
	}
}

