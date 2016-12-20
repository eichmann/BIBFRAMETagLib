package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonRelationIterator thePersonRelationIterator = (PersonRelationIterator)findAncestorWithClass(this, PersonRelationIterator.class);
			pageContext.getOut().print(thePersonRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for relation tag ");
		}
		return SKIP_BODY;
	}
}

