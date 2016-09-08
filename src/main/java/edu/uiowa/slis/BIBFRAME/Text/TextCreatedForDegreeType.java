package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextCreatedForDegreeIterator theTextCreatedForDegreeIterator = (TextCreatedForDegreeIterator)findAncestorWithClass(this, TextCreatedForDegreeIterator.class);
			pageContext.getOut().print(theTextCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

