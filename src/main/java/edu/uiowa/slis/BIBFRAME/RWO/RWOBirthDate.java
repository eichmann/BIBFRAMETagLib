package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RWOBirthDateIterator theRWO = (RWOBirthDateIterator)findAncestorWithClass(this, RWOBirthDateIterator.class);
			pageContext.getOut().print(theRWO.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

