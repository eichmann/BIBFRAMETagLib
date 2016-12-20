package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonAccompaniesIterator thePersonAccompaniesIterator = (PersonAccompaniesIterator)findAncestorWithClass(this, PersonAccompaniesIterator.class);
			pageContext.getOut().print(thePersonAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

