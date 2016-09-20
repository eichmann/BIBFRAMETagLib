package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperProducedAtIterator theNewspaperProducedAtIterator = (NewspaperProducedAtIterator)findAncestorWithClass(this, NewspaperProducedAtIterator.class);
			pageContext.getOut().print(theNewspaperProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

