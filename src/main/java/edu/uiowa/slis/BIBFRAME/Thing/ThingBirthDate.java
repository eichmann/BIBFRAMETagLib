package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingBirthDateIterator theThing = (ThingBirthDateIterator)findAncestorWithClass(this, ThingBirthDateIterator.class);
			pageContext.getOut().print(theThing.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

