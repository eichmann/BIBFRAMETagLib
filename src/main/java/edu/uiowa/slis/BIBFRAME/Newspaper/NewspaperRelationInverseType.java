package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperRelationInverseIterator theNewspaperRelationInverseIterator = (NewspaperRelationInverseIterator)findAncestorWithClass(this, NewspaperRelationInverseIterator.class);
			pageContext.getOut().print(theNewspaperRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for relation tag ");
		}
		return SKIP_BODY;
	}
}

