package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(TextCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextCreatedForDegreeIterator theTextCreatedForDegreeIterator = (TextCreatedForDegreeIterator)findAncestorWithClass(this, TextCreatedForDegreeIterator.class);
			pageContext.getOut().print(theTextCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

