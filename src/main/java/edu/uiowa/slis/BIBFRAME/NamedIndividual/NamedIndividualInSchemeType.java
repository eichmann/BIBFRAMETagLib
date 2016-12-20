package edu.uiowa.slis.BIBFRAME.NamedIndividual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NamedIndividualInSchemeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NamedIndividualInSchemeType currentInstance = null;
	private static final Log log = LogFactory.getLog(NamedIndividualInSchemeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NamedIndividualInSchemeIterator theNamedIndividualInSchemeIterator = (NamedIndividualInSchemeIterator)findAncestorWithClass(this, NamedIndividualInSchemeIterator.class);
			pageContext.getOut().print(theNamedIndividualInSchemeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NamedIndividual for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing NamedIndividual for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

