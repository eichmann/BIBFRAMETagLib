package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperCreatedForDegreeIterator theNewspaperCreatedForDegreeIterator = (NewspaperCreatedForDegreeIterator)findAncestorWithClass(this, NewspaperCreatedForDegreeIterator.class);
			pageContext.getOut().print(theNewspaperCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

