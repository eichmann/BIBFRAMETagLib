package edu.uiowa.slis.BIBFRAME.Item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ItemSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ItemSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ItemSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Item theItem = (Item)findAncestorWithClass(this, Item.class);
			if (!theItem.commitNeeded) {
				pageContext.getOut().print(theItem.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Item for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Item theItem = (Item)findAncestorWithClass(this, Item.class);
			return theItem.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Item for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Item theItem = (Item)findAncestorWithClass(this, Item.class);
			theItem.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Item for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Item for subjectURI tag ");
		}
	}
}

