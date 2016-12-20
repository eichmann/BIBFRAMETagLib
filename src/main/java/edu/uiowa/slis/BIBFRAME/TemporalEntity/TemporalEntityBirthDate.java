package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityBirthDateIterator theTemporalEntity = (TemporalEntityBirthDateIterator)findAncestorWithClass(this, TemporalEntityBirthDateIterator.class);
			pageContext.getOut().print(theTemporalEntity.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

