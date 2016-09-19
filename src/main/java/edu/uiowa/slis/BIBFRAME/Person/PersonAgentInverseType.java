package edu.uiowa.slis.BIBFRAME.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PersonAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonAgentInverseIterator thePersonAgentInverseIterator = (PersonAgentInverseIterator)findAncestorWithClass(this, PersonAgentInverseIterator.class);
			pageContext.getOut().print(thePersonAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for agent tag ");
		}
		return SKIP_BODY;
	}
}

